/* Generated by Xgen from: E90.02.00 on: 2006-02-16 08:30 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   ModEfpFinTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Modify EFP-Fin Trade
*
*******************************************************************************/

#ifndef _MODEFPFINTRD_HXX_
#define _MODEFPFINTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_MOD_EFP_FIN_TRD_REQUEST_T_
#define _FUT_BSC_MOD_EFP_FIN_TRD_REQUEST_T_

typedef struct futBscModEfpFinTrdRequestTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    char             trnIdNo         [TRN_ID_NO_LEN];
    trdrIdGrpT       trdrIdGrp;
    char             opnClsCod;
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
    char             undrIsinCod     [UNDR_ISIN_COD_LEN];
    char             nomVal          [NOM_VAL_LEN];
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             futPrc          [DRIV_PRICE_LEN];
    char             hdgeTyp         [HDGE_TYP_LEN];
    char             setlDat         [DRIV_DATE_LEN];
    char             setlInst        [SETL_INST_LEN];
    cshLegEfpFinGrpT cshLegEfpFinGrp;
    char             cshPrcEfpFin    [CSH_PRC_EFP_FIN_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscModEfpFinTrdRequestT, *pFutBscModEfpFinTrdRequestT;

#endif  /* _FUT_BSC_MOD_EFP_FIN_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_MOD_EFP_FIN_TRD_REQUEST_T_
#define _FUT_MOD_EFP_FIN_TRD_REQUEST_T_

typedef struct futModEfpFinTrdRequestTag
{
    dataHeaderT      header;
    futBscModEfpFinTrdRequestT basic;
} futModEfpFinTrdRequestT, *pFutModEfpFinTrdRequestT;

#endif  /* _FUT_MOD_EFP_FIN_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_MOD_EFP_FIN_TRD_RESPONSE_T_
#define _FUT_BSC_MOD_EFP_FIN_TRD_RESPONSE_T_

typedef struct futBscModEfpFinTrdResponseTag
{
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             exchRat         [EXCH_RAT_LEN];
    cshLegEfpFinGrpT cshLegEfpFinGrp;
} futBscModEfpFinTrdResponseT, *pFutBscModEfpFinTrdResponseT;

#endif  /* _FUT_BSC_MOD_EFP_FIN_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_MOD_EFP_FIN_TRD_RESPONSE_T_
#define _FUT_MOD_EFP_FIN_TRD_RESPONSE_T_

typedef struct futModEfpFinTrdResponseTag
{
    dataHeaderT      header;
    futBscModEfpFinTrdResponseT basic;
} futModEfpFinTrdResponseT, *pFutModEfpFinTrdResponseT;

#endif  /* _FUT_MOD_EFP_FIN_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _MODEFPFINTRD_HXX_ */

/******************************************************************************/
/* End of file ModEfpFinTrd.hxx */
/******************************************************************************/
