/* Generated by Xgen from: E90.02.00 on: 2006-02-16 08:30 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelStratBlkAuctReq.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete Strategy Block Auction Request
*
*******************************************************************************/

#ifndef _DELSTRATBLKAUCTREQ_HXX_
#define _DELSTRATBLKAUCTREQ_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_DEL_STRAT_BLK_AUCT_REQ_REQUEST_T_
#define _BSC_DEL_STRAT_BLK_AUCT_REQ_REQUEST_T_

typedef struct bscDelStratBlkAuctReqRequestTag
{
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    stratIdGrpT      stratIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscDelStratBlkAuctReqRequestT, *pBscDelStratBlkAuctReqRequestT;

#endif  /* _BSC_DEL_STRAT_BLK_AUCT_REQ_REQUEST_T_ */

/******************************************************************************/

#ifndef _DEL_STRAT_BLK_AUCT_REQ_REQUEST_T_
#define _DEL_STRAT_BLK_AUCT_REQ_REQUEST_T_

typedef struct delStratBlkAuctReqRequestTag
{
    dataHeaderT      header;
    bscDelStratBlkAuctReqRequestT basic;
} delStratBlkAuctReqRequestT, *pDelStratBlkAuctReqRequestT;

#endif  /* _DEL_STRAT_BLK_AUCT_REQ_REQUEST_T_ */

/******************************************************************************/

#ifndef _DEL_STRAT_BLK_AUCT_REQ_RESPONSE_T_
#define _DEL_STRAT_BLK_AUCT_REQ_RESPONSE_T_

typedef struct delStratBlkAuctReqResponseTag
{
    dataHeaderT      header;
} delStratBlkAuctReqResponseT, *pDelStratBlkAuctReqResponseT;

#endif  /* _DEL_STRAT_BLK_AUCT_REQ_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELSTRATBLKAUCTREQ_HXX_ */

/******************************************************************************/
/* End of file DelStratBlkAuctReq.hxx */
/******************************************************************************/
